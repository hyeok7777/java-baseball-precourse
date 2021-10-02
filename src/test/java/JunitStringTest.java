import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitStringTest {

    @Test
    @DisplayName("1,2를 ,로 split")
    void splitString() {
        String str = "1,2";
        String[] strArr = str.split(",");

        Assertions.assertThat(strArr).contains("1", "2");
    }

    @Test
    @DisplayName("(1,2)에서 substring()을 통해 () 제거")
    void substringString() {
        String str = "(1,2)";
        str = str.substring(1,4);

        Assertions.assertThat(str).isEqualTo("1,2");
    }

    @Test
    @DisplayName("abc값이 주어졌을 때 charAt() 메소드를 통해 특정위치 문자 가져오기")
    void charAtString() {
        String str = "abc";

        Assertions.assertThatThrownBy(() -> {
            str.charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 5");
    }

}
