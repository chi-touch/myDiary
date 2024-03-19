package repositories;

import model.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {

    private List<Entry>entryList;
    private int numberOfEntries;
    private int number;


    public void Entry(){}

    public EntryRepositoryImpl(){
        this.entryList = new ArrayList<>();
    }
    @Override
    public Entry save(Entry entry) {
        entryList.add(entry);
        numberOfEntries ++;

        return entry;
    }

    @Override
    public List<Entry> findAll() {

        return null;
    }

    @Override
    public Entry findById(int id) {
        return null;
    }

    @Override
    public int generateId() {
        return number ++;
    }

    @Override
    public List<Entry> findByAuthor(String author) {
        return null;
    }

    public int numberOfEntries() {
        return numberOfEntries;
    }
}
