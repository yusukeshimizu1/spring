package diaryApi.exception;

public class DiaryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DiaryNotFoundException(Long id) {
		super("日記ID:" + id + "は見つかりません。");
	}
}
