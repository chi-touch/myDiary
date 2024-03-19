package repositories;


import model.Entry;

import java.util.List;

public interface EntryRepository {
    Entry save(Entry entry);
    List<Entry> findAll();
    Entry findById(int id);
    int generateId();


    List <Entry> findByAuthor(String author);
}
