
    public class Main {
        
        public static void main(String [] args)
        {
            ReadData r = new ReadData();
            Song [] list = r.read();

            System.out.println("Total number of songs: " + r.totalNumSongs(list));
            System.out.println("Total number of songs from 1982: " + r.numSongs1982(list));
            System.out.println("Total number of songs from 2000: " + r.numSongs2000(list));
            System.out.println("Total number of songs from 2015: " + r.numSongs2015(list));
            System.out.println("Number of songs with danceability ratings > 0.80: " + r.numSongsDanceable(list));
            System.out.println("Song with largest length: " + r.getLongestTitle(list));
            System.out.println("Song with lowest shakeability score: " + r.shakeLowestTitle(list));
            System.out.println("Loudest song (song with the highest loudness rating): " + r.songLoudest(list));
            System.out.println("Average obscenity level in 50s: " + r.averageObscenity50s(list));
            System.out.println("Average obscenity level in 60s: " + r.averageObscenity60s(list));
            System.out.println("Average obscenity level in 70s: " + r.averageObscenity70s(list));
            System.out.println("Average obscenity level in 80s: " + r.averageObscenity80s(list));
            System.out.println("Average obscenity level in 90s: " + r.averageObscenity90s(list));
            System.out.println("Average obscenity level in 00s: " + r.averageObscenity00s(list));
            System.out.println("Average obscenity level in 10s: " + r.averageObscenity10s(list));
            System.out.println("Number of songs with Michael Jackson in it: " + r.numSongsJackson(list));
            System.out.println("Number of songs with Whitney Houston in it: " + r.numSongsHouston(list));
        }
    }
