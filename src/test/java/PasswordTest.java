import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    @DisplayName("Passwort hat mindestens 7 Zeichen")
    public void passwordsavemaxsevencharater() {
        //GIVEN
        String password = "Passw123";

        //WHEN
        boolean result = Password.checkpasswordlengh(password);

        //THEN
        assertEquals(true, result);

    }

    @Test
    @DisplayName("Passwort hat einen Großbuchstaben")
    public void passwordsavehavecapitalletter() {
        //GIVEN
        String password = "ABC";

        //WHEN
        boolean result = Password.checkpasswordcapital(password);

        //THEN
        assertEquals("true", result);

    }

    @Test
    @DisplayName("Passwort hat eine Zahl")
    public void passwordsavehaveanumber() {
        //GIVEN
        String password = "123";

        //WHEN
        boolean result = Password.checkpasswordnumber(password);

        //THEN
        assertEquals("true", result);

    }


}