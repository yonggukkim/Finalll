package service;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.context.WebApplicationContext;

import command.HotelCommand;
import command.LoginSession;
import model.Activitys;
import model.Hotel;
import model.Restore;
import repository.HotelRepository;

@Service
public class HotelService implements ApplicationContextAware {
	private WebApplicationContext context = null;

	@Autowired
	private HotelRepository hotelRepository;

	public List<Hotel> selectHotelList(Hotel hotel, Model model) {
		List<Hotel> list = hotelRepository.selectHotelList(hotel);
		model.addAttribute("list", list);
		return list;
	}

	public Integer insertHotel(HotelCommand hotel, Model model, HttpSession session) {
		Hotel tel = new Hotel();
		LoginSession loginSession = (LoginSession) session.getAttribute("info");
		tel.setStaffNumber(loginSession.getCommandNum());
		tel.setCityNum(hotel.getCityNum());
		tel.setContinentName(hotel.getContinentName());
		tel.setCountryNum(hotel.getCountryNum());
		tel.setHotelBreakfast(hotel.isHotelBreakfast());
		tel.setHotelCate(hotel.getHotelCate());
		tel.setHotelCheckin(hotel.getHotelCheckin());
		tel.setHotelCheckout(hotel.getHotelCheckout());
		tel.setHotelCompany(hotel.getHotelCompany());
		tel.setHotelContent(hotel.getHotelCompany());
		tel.setHotelGrade(hotel.getHotelGrade());
		tel.setHotelName(hotel.getHotelName());
		tel.setHotelPresident(hotel.getHotelPresident());
		tel.setHotelPrice(hotel.getHotelPrice());
		tel.setHotelTel(hotel.getHotelTel());
		Integer result = hotelRepository.insertHotel(tel);

//		upload(hotel);
		model.addAttribute("hotel", tel);
		return result;
	}

	private void upload(Hotel hotel) {
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

	public void selectHotelOne(Hotel hotel, Model model) {
		System.out.println("service detail : " + hotel.getHotelNum());
		Hotel tel = hotelRepository.selectHotelOne(hotel);
		System.out.println("service detail after : " + tel.getHotelNum());
		System.out.println("service detail after : " + tel.getStaffNumber());
		model.addAttribute("hoteldetail", tel);
	}

	public void modifyHotelOne(String hotelNum, Model model) {
		Hotel tel = new Hotel();
		tel = hotelRepository.modifyHotelOne(hotelNum);
		model.addAttribute("modify", tel);
	}

	public String updateHotel(Hotel hotel, Model model) {
		Integer result = hotelRepository.updateHotel(hotel);
		String u = null;
		if (result > 0) {
			model.addAttribute("list", hotel);
			u = "redirect:product";
		} else {
			model.addAttribute("bodyPage", "product/hotel_modify.jsp");
			u = "main";
		}
		return u;
	}

	public String deleteHotel(String hotelNum, Model model) {
		String u = null;
		Integer result = hotelRepository.deleteHotel(hotelNum);
		if (result > 0) {
			model.addAttribute("result", result);
			u = "redirect:product";
		} else {
			model.addAttribute("bodyPage", "product/hotel_modify.jsp");
			u = "main";
		}
		return u;
	}
}
