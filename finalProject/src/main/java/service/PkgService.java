package service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;

import command.LoginSession;
import command.PkgCommand;
import model.Activitys;
import model.City;
import model.Hotel;
import model.Pkg;
import model.Restore;
import repository.PkgRepository;
@Service
public class PkgService /*implements ApplicationContextAware*/ {
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
		p.setPkgName(pkg.getPkgName());
		p.setPkgPeriod(pkg.getPkgPeriod());
		p.setPkgPrice(pkg.getPkgPrice());
		p.setPkgReference(pkg.getPkgReference());
		p.setPkgReview(pkg.getPkgReview());
		p.setPkgTheme(pkg.getPkgTheme());
		p.setPkgWeatherInfo(pkg.getPkgWeatherInfo());
		Integer result = pkgRepository.insertPkg(p);

//		upload(hotel);
		model.addAttribute("pkg", p);
		return result;
	}

	private void upload(Pkg pkg) {
		String cpath = "C:/a01_prg/workspace/javaexp/springboard/WebContent/z01_upload";
		String path = context.getServletContext().getRealPath("z01_upload");
		File file;
		Restore res;

//		for (MultipartFile mf : activity.getActivityFile()) {
//
//			file = new File(path, mf.getOriginalFilename());
//			res = new Restore(path, mf.getOriginalFilename(), activity.getActivityName()); // res의 vo객체 만들어짐 (경로, 파일명, 설명)
//
//			// stream 형식의 파일 -> 실제파일로 전환하면 저장
//			try {
//				mf.transferTo(file);
//				// 파일 정보 입력
//				 Files.copy(Paths.get( path+"/"+mf.getOriginalFilename()),
//	                        Paths.get(cpath+"/"+mf.getOriginalFilename()),
//	                        StandardCopyOption.REPLACE_EXISTING);
//				 activityRepository.insertRestore(res);
//
//			} catch (IllegalStateException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
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

	public void hotelSelectOnePkg(Hotel hotel, Model model) {
		System.out.println("service3 " + hotel.getCountryNum());
		System.out.println("service3 " + hotel.getContinentName());
		System.out.println("service3 " + hotel.getCityNum());
		Hotel list = pkgRepository.hotelSelectOnePkg(hotel);
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
