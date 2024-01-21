package diaryApi.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import diaryApi.model.Diary;

@Repository
public interface DiaryRepository extends CrudRepository<Diary, Long>{
	List<Diary> findAllByOrderByIdDesc();
}
