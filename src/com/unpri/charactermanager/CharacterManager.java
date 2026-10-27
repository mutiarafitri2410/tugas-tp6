package com.unpri.charactermanager;
import java.util.ArrayList;

public class CharacterManager {
    private final ArrayList<Character> characters =
        new ArrayList<>();

    /**
     * Menambahkan karakter jika nama belum terdaftar.
     * @param character karakter yang akan ditambahkan
     * @return true jika berhasil, false jika ditolak
     */
    public boolean addCharacter(Character character) {
        if (character == null) {
            return false;
        }

        if (findByName(character.getName()) != null) {
            return false;
        }

        characters.add(character);
        return true;
    }

    /**
     * Mencari karakter berdasarkan nama.
     * Pencarian tidak membedakan huruf besar dan kecil.
     */
    public Character findByName(String name) {
        if (name == null) {
            return null;
        }

        for (Character character : characters) {
            if (character.getName().equalsIgnoreCase(name.trim())) {
                return character;
            }
        }

        return null;
    }

    /**
     * Menghapus karakter berdasarkan nama.
     * @return true jika karakter berhasil dihapus
     */
    public boolean removeCharacter(String name) {
        Character found = findByName(name);

        if (found == null) {
            return false;
        }

        return characters.remove(found);
    }

    /**
     * Mengembalikan jumlah karakter yang tersimpan.
     */
    public int getTotalCharacters() {
        return characters.size();
    }

    /**
     * Mengembalikan salinan daftar, bukan daftar internal.
     */
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    /**
     * Menghitung rata-rata level seluruh karakter.
     * @return 0.0 jika daftar kosong
     */
    public double getAverageLevel() {
        if (characters.isEmpty()) {
            return 0.0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    /**
     * Mencari semua karakter dengan tipe tertentu.
     * @param type tipe karakter yang dicari
     * @return daftar baru yang berisi hasil pencarian
     */
    public ArrayList<Character> findByType(CharacterType type) {
        ArrayList<Character> result = new ArrayList<>();

        if (type == null) {
            return result;
        }

        for (Character character : characters) {
            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }

    /**
     * Mencari karakter dengan level tertinggi.
     * @return karakter terkuat, atau null jika daftar kosong
     */
    public Character findStrongest() {
        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character character : characters) {
            if (character.getLevel() > strongest.getLevel()) {
                strongest = character;
            }
        }

        return strongest;
    }
}
