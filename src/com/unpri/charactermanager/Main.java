package com.unpri.charactermanager;
public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        System.out.println("=== CHARACTER MANAGER TP5 ===");

        // A. CREATE
        System.out.println("\n--- CREATE ---");

        Character arka = new Character(
            "Arka", 10, CharacterType.WARRIOR
        );
        Character luna = new Character(
            "Luna", 8, CharacterType.MAGE
        );
        Character bima = new Character(
            "Bima", 12, CharacterType.ARCHER
        );
        Character mira = new Character(
            "Mira", 6, CharacterType.HEALER
        );

        System.out.println("Tambah Arka: "
            + manager.addCharacter(arka));
        System.out.println("Tambah Luna: "
            + manager.addCharacter(luna));
        System.out.println("Tambah Bima: "
            + manager.addCharacter(bima));
        System.out.println("Tambah Mira: "
            + manager.addCharacter(mira));

        // Uji nama duplikat
        System.out.println("\n--- UJI DUPLIKAT ---");

        Character duplikat = new Character(
            "arka", 20, CharacterType.MAGE
        );

        System.out.println("Tambah arka lagi: "
            + manager.addCharacter(duplikat));
        System.out.println("Total karakter: "
            + manager.getTotalCharacters());

        // A. READ
        System.out.println("\n--- READ ---");

        System.out.println("Cari Luna: "
            + manager.findByName("Luna"));
        System.out.println("Cari Doni: "
            + manager.findByName("Doni"));

        System.out.println("Semua karakter:");
        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }

        // Uji defensive copy
        System.out.println("\n--- UJI DEFENSIVE COPY ---");

        java.util.ArrayList<Character> salinan =
            manager.getAllCharacters();

        salinan.clear();

        System.out.println("Ukuran salinan: "
            + salinan.size());
        System.out.println("Jumlah asli: "
            + manager.getTotalCharacters());

        // B. MINI-CHALLENGE
        System.out.println("\n--- MINI-CHALLENGE ---");

        System.out.printf("Rata-rata level: %.2f%n",
            manager.getAverageLevel());

        System.out.println("Karakter WARRIOR:");
        for (Character c :
                manager.findByType(CharacterType.WARRIOR)) {
            System.out.println(c);
        }

        // C. FITUR MANDIRI
        System.out.println("\n--- FIND STRONGEST ---");
        System.out.println("Karakter terkuat: "
            + manager.findStrongest());

        // UPDATE
        System.out.println("\n--- UPDATE ---");

        Character target = manager.findByName("Luna");

        if (target != null) {
            target.setLevel(15);
            System.out.println("Luna setelah update: " + target);
        }

        System.out.printf("Rata-rata setelah update: %.2f%n",
            manager.getAverageLevel());

        // DELETE
        System.out.println("\n--- DELETE ---");

        System.out.println("Hapus Bima: "
            + manager.removeCharacter("Bima"));
        System.out.println("Hapus Doni: "
            + manager.removeCharacter("Doni"));
        System.out.println("Total akhir: "
            + manager.getTotalCharacters());

        // Eksperimen reference
        System.out.println("\n--- EKSPERIMEN REFERENCE ---");

        Character a = new Character(
            "Test", 3, CharacterType.MAGE
        );
        Character b = a;

        b.setLevel(8);

        System.out.println("Level a: " + a.getLevel());
        System.out.println("a == b: " + (a == b));

        Character independen = new Character(
            a.getName(), a.getLevel(), a.getType()
        );

        independen.setLevel(2);

        System.out.println("Level a: " + a.getLevel());
        System.out.println("Level independen: "
            + independen.getLevel());

        // Uji daftar kosong
        System.out.println("\n--- UJI DAFTAR KOSONG ---");

        CharacterManager kosong = new CharacterManager();

        System.out.println("Rata-rata kosong: "
            + kosong.getAverageLevel());
        System.out.println("Karakter terkuat: "
            + kosong.findStrongest());
        System.out.println("Karakter WARRIOR: "
            + kosong.findByType(CharacterType.WARRIOR));

        System.out.println("Total karakter: "
            + kosong.getTotalCharacters());

        System.out.println("\nTotal objek dibuat: "
            + Character.getTotalCharacterCreated());
    }
}
