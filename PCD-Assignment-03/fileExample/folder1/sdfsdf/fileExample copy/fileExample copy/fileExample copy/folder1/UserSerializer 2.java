package it.unibo.ds.presentation;

import com.google.gson.*;

import java.lang.reflect.Type;

public class UserSerializer implements JsonSerializer<User> {

    @Override
    public JsonElement serialize(User src, Type typeOfSrc, JsonSerializationContext context) {
        //JsonSerializationContext= quando serializzo qualcosa posso richiamare questo metodo per reserialiizzare un elemento di qualche altro tipo
        var object = new JsonObject();
        object.addProperty("username", src.getUsername());
        object.addProperty("full_name", src.getFullName());
        object.addProperty("password", src.getPassword());
        var emails = new JsonArray();
        for (var email : src.getEmailAddresses()) {
            emails.add(new JsonPrimitive(email));
        }
        object.add("email_addresses", emails);
        object.add("role", context.serialize(src.getRole()));
        object.add("birth_date", context.serialize(src.getBirthDate()));
        return object;
    }
}
