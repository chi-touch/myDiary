package repositories;

import model.Diary;

import java.util.List;

public interface DiaryRepository {
    Diary save(Diary diary);
    List<Diary>findAll();
    Diary findById(String username);
    long count();

    public void delete(String username);
    public  void delete(Diary diary);



}
