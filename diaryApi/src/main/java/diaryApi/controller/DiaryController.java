package diaryApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import diaryApi.exception.DiaryNotFoundException;
import diaryApi.model.Diary;
import diaryApi.service.DiaryService;

@RestController
@CrossOrigin(origins = "*") 
public class DiaryController {
	
	@Autowired
	private DiaryService diaryService;


	@GetMapping("/diaries")
	public List<Diary> getAllDiaries(){
		return diaryService.getAllDiaries();
	}
	
	@GetMapping("/diaries/{id}")
	public Diary getDiary(@PathVariable("id") Long id) {
		return diaryService.getDiary(id).orElseThrow(() -> new DiaryNotFoundException(id));
	}
	
	@PostMapping("/diaries")
	public void addDiary(@RequestBody Diary diary) {
		diaryService.addDiary(diary);
	}
	
	@PutMapping("/diaries/{id}")
	public void updateItem(@RequestBody Diary diary,
			@PathVariable("id") Long id) {
		diaryService.updateDiary(id, diary);
	}
	
	@DeleteMapping("/diaries/{id}")
	public void deleteItem(@PathVariable("id") Long id) {
		diaryService.deleteDiary(id);
	}
}
