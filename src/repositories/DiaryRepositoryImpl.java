package repositories;

import model.Diary;

import java.util.ArrayList;
import java.util.List;
import model.Diary;
public class DiaryRepositoryImpl implements DiaryRepository{

    private List<Diary> myDiary = new ArrayList<>();
    private int numberOfDiaries = 0;
    @Override
    public Diary save(Diary diary) {
        if(!myDiary.contains(diary))myDiary.add(diary);
        numberOfDiaries++;
        return diary;

    }

    @Override
    public List<Diary> findAll() {
        return myDiary;
    }

    @Override
    public Diary findById(String username) {
        for (var diary : myDiary){
             if(diary.getUsername().equals(username))return diary;
        }
        return null;
    }

    @Override
    public long count() {
        return numberOfDiaries;
    }

    @Override
    public void delete(String username) {
        Diary removeDiary = null;
        for (Diary diary1 : myDiary){
            if(diary1.getUsername().equals(username)){
                removeDiary = diary1;
            }
        }
        if(removeDiary != null)myDiary.remove(removeDiary);
        numberOfDiaries--;
    }

    @Override
    public void delete(Diary diary) {
        myDiary.clear();
        numberOfDiaries =0;

    }
    public int numberOfDiaries(){
        return numberOfDiaries;
    }


}
