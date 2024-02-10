package diaryApi.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import diaryApi.model.Diary;
import diaryApi.repo.DiaryRepository;

@Service
public class DiaryService {
	
	@Autowired
	private DiaryRepository diaryRepository;
	
		
	public List<Diary> getAllDiaries(){
		List<Diary> allDiaries = new ArrayList<>();
		diaryRepository.findAllByOrderByIdDesc().forEach(allDiaries::add);
		return allDiaries;
	}
	
	public Optional<Diary> getDiary(Long id) {
		return diaryRepository.findById(id);
	}
	
	public void addDiary(Diary diary) {
		diary.setCreateDatetime(LocalDateTime.now());
		diary.setUpdateDatetime(LocalDateTime.now());
		diaryRepository.save(diary);
	}
	
	public void updateDiary(Long id, Diary diary) {
		if(diaryRepository.findById(id).get() != null) {
			diary.setUpdateDatetime(LocalDateTime.now());
			diaryRepository.save(diary);
		}
	}
	
	public void deleteDiary(Long id) {
		diaryRepository.deleteById(id);
	}
}
