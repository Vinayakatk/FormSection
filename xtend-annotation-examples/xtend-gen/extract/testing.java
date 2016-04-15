package extract;

import extract.fieldparticipant;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.eclipse.xtend.lib.macro.Active;

@SuppressWarnings("all")
public class testing {
  @Target(ElementType.FIELD)
  @Active(fieldparticipant.class)
  public @interface TestAnn {
  }
}
