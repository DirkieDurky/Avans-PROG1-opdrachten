package guess_who;

public class Person {
    String name = null;
    HairColor hairColor = null;
    EyeColor eyeColor = null;
    Boolean glasses = null;
    Gender gender = null;
    SkinColor skinColor = null;
    Boolean wearingHat = null;
    Boolean bald = null;
    Boolean beard = null;

    Person(String name, HairColor hairColor, EyeColor eyeColor, Boolean glasses, Gender gender, SkinColor skinColor,
            Boolean wearingHat, Boolean bald, Boolean beard) {
        this.name = name;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.glasses = glasses;
        this.gender = gender;
        this.skinColor = skinColor;
        this.wearingHat = wearingHat;
        this.bald = bald;
        this.beard = beard;
    }
}

enum HairColor {
    BLONDE,
    BLACK,
    WHITE,
    BROWN,
    ORANGE,
}

enum EyeColor {
    BROWN,
    BLUE,
}

// This is not very woke, I know
enum Gender {
    MALE,
    FEMALE
}

enum SkinColor {
    BLACK,
    WHITE,
}
