package si.um.feri.osebe.vao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

@Data
@NoArgsConstructor
@Entity
public class Oseba {

    public Oseba(String ime, String priimek) {
        this.ime = ime;
        this.priimek = priimek;
    }

    public Oseba(String ime, String priimek, LocalDate datumRojstva) {
        this.ime = ime;
        this.priimek = priimek;
        this.datumRojstva = datumRojstva;
    }

    private String ime;

    private String priimek;

    @Id
    @GeneratedValue
    private int id;

    private LocalDate datumRojstva=LocalDate.now();

    public long getStarost() {
        long ret=ChronoUnit.YEARS.between(datumRojstva, LocalDate.now());
        if (ret<0) ret=0;
        return ret;
    }

    public boolean staVSorodu(Oseba oseba2) {
        if (oseba2 == null || this.getPriimek() == null || oseba2.getPriimek() == null) {
            return false;
        }
        String priimek1 = normalize(this.getPriimek());
        String priimek2 = normalize(oseba2.getPriimek());
        return priimek1.equalsIgnoreCase(priimek2);
    }

    private String normalize(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("").replace("Đ", "D").replace("đ", "d");
    }

}
