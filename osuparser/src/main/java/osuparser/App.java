package osuparser;

import osuparser.BeatMap.*;

public class App {
    public static void main(String[] args) {
        BeatMap parsedMap = BeatMap.parseOsuFile(
                "C:\\Users\\Ep1c_M1n10n\\Desktop\\PROJECTS\\PROGRAMMING\\JAVA\\osuParser\\Ai Otsuka - Sakuranbo (Echo49) [Hard].osu");

        System.out.println("General Data");
        System.out.println(parsedMap.audioFilename);
        System.out.println(parsedMap.audioHash);
        System.out.println(parsedMap.previewTime);

        System.out.println("Metadata");
        System.out.println(parsedMap.metadata.artist);
        System.out.println(parsedMap.metadata.title);
        System.out.println(parsedMap.metadata.creator);
        System.out.println(parsedMap.metadata.diffName);

        System.out.println("Difficulty Settings");
        System.out.println(parsedMap.difficulty.hpDrainRate);
        System.out.println(parsedMap.difficulty.circleSize);
        System.out.println(parsedMap.difficulty.overallDifficulty);
        System.out.println(parsedMap.difficulty.sliderMultiplier);
        System.out.println(parsedMap.difficulty.sliderTickRate);

        System.out.println("Storyboard Events");
        for (StoryboardEvent event : parsedMap.storyboardEvents) {
            System.out.println(event.type);
            System.out.println(event.startTime);
            for (Object param : event.parameters)
                System.out.println(param);
        }

        System.out.println("Timing Points");
        for (TimingPoint timingPoint : parsedMap.timingPoints) {
            System.out.println(timingPoint.time);
            System.out.println(timingPoint.fourthNoteDelay);
            System.out.println(timingPoint.bpm);
        }
    }
}
