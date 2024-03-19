package repositories;

import model.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoryImplTest {

    private EntryRepositoryImpl entryRepositoryimpl;
    private Entry entry;

    @BeforeEach
    public void initializeEntryRepositoryImpl(){
        entryRepositoryimpl = new EntryRepositoryImpl();
        entry = new Entry();
    }


    @Test
    public void testToSaveAnEntry(){
        Entry myEntry = new Entry();
        entryRepositoryimpl.save(myEntry);

        assertEquals(1,entryRepositoryimpl.numberOfEntries());
    }

    @Test
    public void testToFindAllEntry(){
        Entry myEntry = new Entry();
        Entry myEntry1 = new Entry();
        entryRepositoryimpl.save(myEntry);
        entryRepositoryimpl.save(myEntry1);
        entryRepositoryimpl.findAll();
        assertEquals(2,entryRepositoryimpl.numberOfEntries());
    }

    @Test
    public void testToFindById(){
        Entry myEntry = new Entry();
        entryRepositoryimpl.save(myEntry);
        entryRepositoryimpl.findById()
    }

}