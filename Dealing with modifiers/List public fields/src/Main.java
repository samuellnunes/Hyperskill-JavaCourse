/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        return java.util.Arrays.stream(object.getClass().getDeclaredFields())
                .filter(field -> java.lang.reflect.Modifier.isPublic(field.getModifiers()))
                .map(field -> field.getName())
                .toArray(String[]::new);
    }
}