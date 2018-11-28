package service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import command.HotelCommand;
import command.LoginSession;
import command.PkgCommand;
import model.Activitys;
import model.City;
import model.Hotel;
import model.Pkg;
import model.Restore;
import repository.PkgRepository;
@Service
public class PkgService implements ApplicationContextAware {
	private WebApplicationContext context = null;
	
	@Autowired
	private PkgRepository pkgRepository;
	
	public List<Pkg> selectPkgList(Pkg pkg, Model model) {
		List<Pkg> list = pkgRepository.selectPkgList(pkg);
		model.addAttribute("pkglist", list);
		return list;
	}

	public Integer insertPkg(PkgCommand pkg, Model model, HttpSession session) {
		Pkg p = new Pkg();
		LoginSession loginSession = (LoginSession) session.getAttribute("info");
		p.setStaffNumber(loginSession.getCommandNum());
		p.setCityNum(pkg.getCityNum());
		p.setContinentName(pkg.getContinentName());
		p.setCountryNum(pkg.getCountryNum());
		p.setGuideNum(pkg.getGuideNum());
		p.setPkgCate(pkg.getPkgCate());
		p.setPkgCaution(pkg.getPkgCaution());
		p.setPkgContent(pkg.getPkgContent());
		p.setPkgMeetingPlace(pkg.getPkgMeetingPlace());
		p.setPkgMemberMin(pkg.getPkgMemberMin());
		p.setPkgMemberMax(pkg.getPkgMemberMax());
		p.setPkgMemberCur(pkg.getPkgMemberCur());
		p.setPkgName(pkg.getPkgName());
		p.setPkgPeriod(pkg.getPkgPeriod());
		p.setPkgPrice(pkg.getPkgPrice());
		p.setPkgReference(pkg.getPkgReference());
		p.setPkgReview(pkg.getPkgReview());
		p.setPkgTheme(pkg.getPkgTheme());
		p.setPkgWeatherInfo(pkg.getPkgWeatherInfo());
		List<Restore> list = upload(pkg.getPkgFile(), pkg.getPkgName());
		System.out.println("sdads adadsasdsda : "+list.size());
		Integer result = pkgRepository.insertPkg(p,list);

		
		model.addAttribute("pkg", p);
		return result;
	}

	private List<Restore> upload(MultipartFile[] a, String b) {
//		String cpath = "C:\\Users\\kook7\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\finalProject\\files";
		String path = context.getServletContext().getRealPath("files");
		File file;
		Restore res;
		String storedFileName;
		String originalFile;
		String originalFileExtension;
		List<Restore> list = new ArrayList<Restore>();
		System.out.println("a size : " +a.length);
		for (MultipartFile mf : a) {
			originalFile = mf.getOriginalFilename();
			originalFileExtension = originalFile.substring(originalFile.lastIndexOf("."));
			storedFileName = UUID.randomUUID().toString().replaceAll("-", "") + originalFileExtension;
			file = new File(path, storedFileName);
			res = new Restore( path, mf.getOriginalFilename(), storedFileName, b); // res의 vo객체 만들어짐 (경로, 파일명, 설명)
			// stream 형식의 파일 -> 실제파일로 전환하면 저장
			try {
				mf.transferTo(file);				
				list.add(res);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.context = (WebApplicationContext) applicationContext;
	}

	public void selectPkgOne(Pkg pkg, Model model) {
		System.out.println("service detail : " + pkg.getPkgNum());
		Pkg p = pkgRepository.selectPkgOne(pkg);
		System.out.println("service detail after : " + p.getPkgNum());
		System.out.println("service detail after : " + p.getStaffNumber());
		model.addAttribute("pkgdetail", p);
	}

	public void hotelSelectPkg(City city, Model model) {
		System.out.println("service3 " + city.getCountryNum());
		System.out.println("service3 " + city.getContinentName());
		System.out.println("service3 " + city.getCityNum());
		List<Hotel> list = pkgRepository.hotelSelectPkg(city);
		System.out.println("test"+list);
		model.addAttribute("list", list);
	}

	public void activitySelectPkg(City city, Model model) {
		System.out.println("service3 " + city.getCountryNum());
		System.out.println("service3 " + city.getContinentName());
		System.out.println("service3 " + city.getCityNum());
		List<Activitys> list = pkgRepository.activitySelectPkg(city);
		System.out.println("test"+list);
		model.addAttribute("list", list);
	}

	public void hotelSelectOnePkg(Hotel hotel, Model model, HttpSession session) {
		System.out.println("service3 " + hotel.getCountryNum());
		System.out.println("service3 " + hotel.getContinentName());
		System.out.println("service3 " + hotel.getCityNum());
		Hotel list = pkgRepository.hotelSelectOnePkg(hotel);
		List hotelcart = (List)session.getAttribute("hotelcart");
		if(hotelcart == null) {
			hotelcart = new ArrayList();
		}
		HotelCommand command = null;
		boolean newCart = true;
		for(int i = 0; i < hotelcart.size(); i++) {
			command = (HotelCommand)hotelcart.get(i);
			if(list.getHotelName().equals(command.getHotelName())) {
				newCart = false;
//				command.setHotelPrice(command.getHotelPrice()+command.getHotelPrice());
				System.out.println("cart yes");
			}
		}
		if(newCart) {
			command = new HotelCommand();
			command.setHotelName(list.getHotelName());
			command.setHotelPrice(list.getHotelPrice());
			command.setHotelGrade(list.getHotelGrade());
			hotelcart.add(command);
		}
		session.setAttribute("hotelcart", hotelcart);
		
		System.out.println("test"+list);
		model.addAttribute("list", list);
	}

	public void activitySelectOnePkg(Activitys activity, Model model) {
		System.out.println("service3 " + activity.getCountryNum());
		System.out.println("service3 " + activity.getContinentName());
		System.out.println("service3 " + activity.getCityNum());
		Activitys list = pkgRepository.activitySelectOnePkg(activity);
		System.out.println("test"+list);
		model.addAttribute("list", list);
	}
}
