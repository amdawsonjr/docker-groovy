@Grab(group='org.apache.commons', module='commons-lang3', version='3.5')
import org.apache.commons.lang3.StringUtils

if (new File('/home/root/.groovy/grapes').listFiles().size() == 0) {
    System.exit 1
} else {
    System.exit 0
}
