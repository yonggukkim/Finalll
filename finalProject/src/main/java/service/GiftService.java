package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Gift;
import repository.GiftRepository;

@Service
public class GiftService /* implements ApplicationContextAware*/{
/*	private WebApplicationContext context = null;*/

	@Autowired
	public GiftRepository giftRepository;

	public Integer giftInsert(Gift gift) {
		System.out.println("gift service 진입");
		Integer giftListSelect = giftRepository.giftInsert(gift);
/*		upload(gift);*/
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

/*	private void upload(Gift gift) {

		 //1. 물리적으로 stream방식 파일 업로드
        //1) 파일 서버의 가상경로
        String cpath = "C:/a01_prg/workspace/javaexp/springboard/WebContent/z01_upload";
        
        //2) 웹서버를 구동해서 웹서버 안에 특정한 경로를 지정
        String path = context.getServletContext().getRealPath("z01_upload");
        File file;
        
        //new File(경로, 파일명);
        //2. DB 파일 업로드 정보 입력.. fold fname etc
        GiftRestore gr;
    
        for(MultipartFile mf : gift.getFiles()){
            
            file = new File(mf.getOriginalFilename(),path);
            gr = new GiftRestore(mf.getOriginalFilename(),path);    //gr의 vo객체 만들어짐 (파일명,경로,)
            
            // stream 형식의 파일 -> 실제파일로 전환하면 저장
            try{
                mf.transferTo(file);
                
                // eclipse내에 tomcat을 가동할 시만, 처리 필요 (WAS서버가 존재할땐 필요가 없다!!)
                Files.copy(Paths.get( path+"/"+mf.getOriginalFilename()),
                        Paths.get(cpath+"/"+mf.getOriginalFilename()),
                        StandardCopyOption.REPLACE_EXISTING);
                
                //파일 정보 입력
                giftRepository.grInsert(gr);
                
            }catch(IllegalStateException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
            
            
        }
        
        
    }

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.context = (WebApplicationContext) applicationContext;
	}*/

}
