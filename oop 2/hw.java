public class hw {

    public static void main(String[] args) {

        athletics[] athletes = {
                new human(700, 150),
                new cat(100, 200),
                new bot(500, 0),
                new cat(120, 210),
                new human(1500, 120)
        };

        crossable[] equipments = {
                new barrier(50),
                new running_track(500),
                new barrier(70)
        };

        for (athletics athlete : athletes) {
            for (crossable equipment: equipments) {
                equipment.cross(athlete);
            }
        }
    }
}