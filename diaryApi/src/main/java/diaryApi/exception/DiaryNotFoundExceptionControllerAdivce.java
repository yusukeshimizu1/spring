package diaryApi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DiaryNotFoundExceptionControllerAdivce {

	@ResponseBody
	@ExceptionHandler(DiaryNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String diaryNotFoundHandler (DiaryNotFoundException ex) {
		return ex.getMessage();
	}
}
