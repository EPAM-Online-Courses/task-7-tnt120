package efs.task.reflection.annotations;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
public @interface BuilderProperty {
    String name();
}
