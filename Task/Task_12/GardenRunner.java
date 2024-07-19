class GardenRunner {
    public static void main(String[] args) {
        Garden garden1 = new Garden();
        garden1.createGarden("Lalbagh Botanical Garden", "Mavalli, Bengaluru", 240);
            garden1.displayGardenInfo();
        

        Garden garden2 = new Garden();
        garden2.createGarden("Cubbon Park", "Kasturba Road, Bengaluru", 300);
            garden2.displayGardenInfo();
        

        Garden garden3 = new Garden();
        garden3.createGarden("Bannerghatta Biological Park", "Bannerghatta Road, Bengaluru", 104.27);
            garden3.displayGardenInfo();
        

        Garden garden4 = new Garden();
        garden4.createGarden("Jawaharlal Nehru Planetarium", "High Grounds, Bengaluru", 6.2);
            garden4.displayGardenInfo();
        

        Garden garden5 = new Garden();
        garden5.createGarden("Indira Gandhi Musical Fountain Park", "Raj Bhavan Road, Bengaluru", 17);
            garden5.displayGardenInfo();
        
    }
}