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

import command.GiftCommand;
import command.LoginSession;
import model.Gift;
import model.Restore;
import repository.GiftRepository;

@Service
public class GiftService implements ApplicationContextAware{
	private WebApplicationContext context = null;

	@Autowired
	public GiftRepository giftRepository;

	public Integer giftInsert(GiftCommand giftCommand, Model model, HttpSession session) {
		System.out.println("gift service 진입");
		Gift gift = new Gift();
		LoginSession loginSession = (LoginSession)session.getAttribute("info");
		gift.setStaffNumber(loginSession.getCommandNum());
		gift.setGiftName(giftCommand.getGiftName());
		gift.setGiftPrice(giftCommand.getGiftPrice());
		gift.setGiftCate(giftCommand.getGiftCate());
		gift.setGiftContent(giftCommand.getGiftContent());
		gift.setGiftCompany(giftCommand.getGiftCompany());
		gift.setGiftTel(giftCommand.getGiftTel());
		gift.setGiftPresident(giftCommand.getGiftPresident());
		List<Restore> list = upload(giftCommand.getFiles(), giftCommand.getGiftName());
		System.out.println("sdads adadsasdsda : "+list.size());
		Integer giftListSelect = giftRepository.giftInsert(gift, list);
		model.addAttribute("gift",gift);
		return giftListSelect;
	}

/*	public Integer grInsert(GiftRestore gr) {
		System.out.println("gift service -grInsert 진입");
		Integer grResult = giftRepository.grInsert(gr);
		return grResult;
	}*/

	public List<Gift> giftSelect(Gift gift) {
		System.out.println("gift service-giftSelect진입 ");
		List<Gift> giftSelect = giftRepository.giftSelect(gift);
		return giftSelect;
	}

	public Gift giftSelectByCondition(Gift gift) {
		System.out.println("gift service-giftSelByCon 진입");
		Gift giftDetail = giftRepository.giftSelectByCondition(gift);
		System.out.println("gift service-giftSelByCon 반환");
		return giftDetail;
	
	}

	public Integer giftDelete(Gift gift) {
		System.out.println("gift service-giftDelte진입");

		Integer result = giftRepository.giftDelete(gift);

		return result;
	}

	public Integer giftModify(Gift gift) {
		Integer result = giftRepository.giftModify(gift);

		return result;
	}

	public List<Gift> giftSelectByName(Gift gift) {
		System.out.println("gift service-giftSelectByName진입");
		if(gift.getGiftName() != null) {
			List<Gift> searchedList = giftRepository.giftSelectByName(gift);
			return searchedList;
		} else if (gift.getGiftContent() != null) {
			List<Gift> searchedList = giftRepository.giftSelectByName(gift);
			return searchedList;
		} else  return null;
	
		
		
	}

	public List<Gift> selectGiftList(Gift gift, Model model) {
			List<Gift> list = giftRepository.selectGiftList(gift);
			model.addAttribute("giftlist", list);
			return list;
	}

	private List<Restore> upload(MultipartFile[] a, String b) {
		String path = context.getServletContext().getRealPath("WEB-INF\\view\\files");
		System.out.println("path dddd"+ path);
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

}
