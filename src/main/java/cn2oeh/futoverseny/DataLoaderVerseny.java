package cn2oeh.futoverseny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cn2oeh.futoverseny.model.Verseny;
import cn2oeh.futoverseny.repository.VersenyRepository;

@Component
public class DataLoaderVerseny implements CommandLineRunner {

    private final VersenyRepository versenyRepository;

    @Autowired
    public DataLoaderVerseny(VersenyRepository versenyRepository) {
        this.versenyRepository = versenyRepository;
    }

    @Override
    public void run(String... args) {

        // add Verseny entities
        Verseny verseny1 = new Verseny();
        verseny1.setVersenyName("Kis kör");
        verseny1.setVersenyLength(1);
        versenyRepository.save(verseny1);

        Verseny verseny2 = new Verseny();
        verseny2.setVersenyName("Nagy kör");
        verseny2.setVersenyLength(2);
        versenyRepository.save(verseny2);
    }
}