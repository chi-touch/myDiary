package repositories;

import model.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryRepositoryImplTest {
    private DiaryRepositoryImpl myDiaryRepositoryImpl;
    private Diary diary;

    @BeforeEach
    public void initializeDiaryRepositoryImpl(){
        myDiaryRepositoryImpl = new DiaryRepositoryImpl();
        diary = new Diary("Ayomide","2345324");

    }

    @Test
    public void testToSaveDiary(){
        Diary  myRepo= new Diary();
        myDiaryRepositoryImpl.save(myRepo);
        assertEquals(1,myDiaryRepositoryImpl.numberOfDiaries());
    }

    @Test
    public void testToSaveTwoDiary(){
        Diary  myRepo1= new Diary();
        Diary  myRepo2= new Diary();
        myDiaryRepositoryImpl.save(myRepo1);
        myDiaryRepositoryImpl.save(myRepo2);
        assertEquals(2,myDiaryRepositoryImpl.numberOfDiaries());
    }

    @Test
    public void testToFindDiaryById(){
        Diary myRepo = new Diary();
        myRepo.setUsername("test");
        myDiaryRepositoryImpl.save(myRepo);
        assertEquals(myDiaryRepositoryImpl.save(myRepo),myDiaryRepositoryImpl.findById("test"));
    }

    @Test
    public void testToFindAllDiariesRepositories(){
        DiaryRepositoryImpl  myRepo = new DiaryRepositoryImpl();
        myRepo.findAll();
        assertEquals(myDiaryRepositoryImpl.findAll(),myRepo.findAll());
    }

    @Test
    public void testToDeleteDiaryByUserName(){
        DiaryRepositoryImpl myRepo = new DiaryRepositoryImpl();
        Diary repo = new Diary();
        repo.setUsername("ayo");
        myRepo.delete("ayo");
        assertEquals(myDiaryRepositoryImpl.count(),0);

    }

    @Test
    public void testToDeleteSecondDiaryByUserName(){
        DiaryRepositoryImpl myRepo = new DiaryRepositoryImpl();
        Diary repo = new Diary("ayomide","2356789");
        myRepo.save(repo);
        Diary repo1 = new Diary("chimi","23446887");
        myRepo.save(repo1);
        assertEquals(2,myRepo.count());
        myRepo.delete("ayomide");
        assertEquals(1,myRepo.count());
    }

    @Test
    public void testToDeleteAllDiary(){
        DiaryRepositoryImpl myRepo = new DiaryRepositoryImpl();
        Diary repo = new Diary("ayomide","2356789");
        myRepo.save(repo);
        Diary repo1 = new Diary("chimi","23446887");
        myRepo.save(repo1);

        assertEquals(2,myRepo.count());
        myRepo.delete("ayomide");
        myRepo.delete("chimi");
        assertEquals(0,myRepo.count());
    }



}