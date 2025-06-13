# Adapter Pattern Project

## About the Adapter Pattern
The Adapter pattern is a structural design pattern that enables incompatible interfaces to collaborate. It serves as a "bridge" by converting the interface of a class (Adaptee) into an interface expected by the client (Target). In this project, the Adapter pattern is applied to allow different audio formats (MP3, FLAC, WAV) to be played using a unified music player interface.

## Project Structure
The project's folder hierarchy is organized as follows:

```
adapter-pattern
├── pom.xml                         # Maven configuration file
├── README.md                       # This file
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── common_adapter       # Traditional Adapter pattern implementation
│   │   │   │   ├── adapters
│   │   │   │   │   ├── FLACAdpater.java    # Adapter for FLAC format
│   │   │   │   │   ├── MP3Adapter.java     # Adapter for MP3 format
│   │   │   │   │   └── WAVAdapter.java     # Adapter for WAV format
│   │   │   │   ├── FLACPlayer.java         # Class for FLAC playback
│   │   │   │   ├── interfaces
│   │   │   │   │   └── AudioPlayer.java    # Unified interface for audio players
│   │   │   │   ├── MP3Player.java          # Class for MP3 playback
│   │   │   │   ├── MusicPlayerApp.java     # Main application using adapters
│   │   │   │   └── WAVPlayer.java          # Class for WAV playback
│   │   │   ├── modern_adapter              # Alternative Adapter pattern implementation
│   │   │   │   ├── FLACPlayer.java         # Class for FLAC playback
│   │   │   │   ├── interfaces
│   │   │   │   │   └── AudioPlayer.java    # Unified interface for audio players
│   │   │   │   ├── MP3Player.java          # Class for MP3 playback
│   │   │   │   ├── MusicPlayerApp.java     # Main application using adapters
│   │   │   │   └── WAVPlayer.java          # Class for WAV playback
│   │   │   └── no_pattern                  # Implementation without the Adapter pattern
│   │   │       └── MP3PlayerApp.java       # Simple MP3 playback application
│   │   └── resources                       # Additional resources (currently empty)
```

### Folder Descriptions
- **common_adapter**: Implements the Adapter pattern traditionally, with adapters for each audio format (FLAC, MP3, WAV) that conform to the `AudioPlayer` interface.
- **modern_adapter**: Offers an alternative implementation of the Adapter pattern, possibly with a more modern or optimized approach, while supporting the same audio playback functionality.
- **no_pattern**: Provides a basic implementation without the Adapter pattern, used for comparison to highlight the pattern's benefits.
- **interfaces**: Contains the `AudioPlayer` interface, defining the contract for all audio players.
- **resources**: Placeholder for configuration files or additional resources (currently empty).

## How to Run
1. Ensure Maven is installed on your system.
2. Navigate to the project directory:
   ```bash
   cd adapter-pattern
   ```
3. Compile and run the project:
   ```bash
   mvn clean install
   mvn exec:java -Dexec.mainClass="common_adapter.MusicPlayerApp"
   ```
   To test other implementations, replace `common_adapter.MusicPlayerApp` with `modern_adapter.MusicPlayerApp` or `no_pattern.MP3PlayerApp`.

## License
This project is licensed under the MIT License.
