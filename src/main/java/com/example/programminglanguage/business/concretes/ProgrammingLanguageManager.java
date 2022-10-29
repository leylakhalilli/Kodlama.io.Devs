package com.example.programminglanguage.business.concretes;

import com.example.programminglanguage.business.abstracts.ProgrammingLanguageService;
import com.example.programminglanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.programminglanguage.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (isNameExist(programmingLanguage)) throw new Exception("Program name cannot be repeated");

        return programmingLanguageRepository.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);

    }

    @Override
    public void update(int id, ProgrammingLanguage programmingLanguage) throws Exception {
        if (isNameExist(programmingLanguage)) throw new Exception("Program name cannot be repeated");
        programmingLanguageRepository.update(id, programmingLanguage);


    }

    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return programmingLanguageRepository.getLanguageById(id);
    }

    public boolean isNameExist(ProgrammingLanguage language) {
        for (ProgrammingLanguage language1 : getAll()) {
            if (language.getName().equals(language1.getName())) {
                return true;
            }
        }
        return false;
    }
}
