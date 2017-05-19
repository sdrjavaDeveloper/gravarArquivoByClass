package sdrJavaDeveloper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String matricula = person.getMatricula().toUpperCase();
        final String nome = person.getNome().toUpperCase();
        

        final Person transformedPerson = new Person(
        		 matricula,
        		 nome
        		);

         
        log.info("Converting (" + person + ") into (" + transformedPerson + ")");

        return transformedPerson;
    }

}

