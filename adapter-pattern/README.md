Adapter Pattern Project
About the Adapter Pattern
The Adapter pattern is a structural design pattern that allows incompatible interfaces to work together. It acts as a "bridge" that converts the interface of a class (Adaptee) into an interface expected by the client (Target). In this project, the Adapter pattern is used to enable different audio formats (MP3, FLAC, WAV) to be played by a music player with a unified interface.
Project Structure
The folder hierarchy of the project is organized as follows:
/adapter-pattern
├── pom.xml                         # Maven configuration file
├── README.md                       # This file
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── common_adapter       # Common Adapter pattern implementation
│   │   │   │   ├── adapters
│   │   │   │   │   ├── FLACAdpater.java    # Adapter for FLAC format
│   │   │   │   │   ├── MP3Adapter.java     # Adapter for MP3 format
│   │   │   │   │   └── WAVAdapter.java     # Adapter for WAV format
│   │   │   │   ├── FLACPlayer.java         # Class for FLAC playback
│   │   │   │   ├── interfaces
│   │   │   │   │   └── AudioPlayer.java    # Unified interface for players
│   │   │   │   ├── MP3Player.java          # Class for MP3 playback
│   │   │   │   ├── MusicPlayerApp.java     # Main application (with adapters)
│   │   │   │   └── WAVPlayer.java          # Class for WAV playback
│   │   │   ├── modern_adapter              # Alternative Adapter pattern implementation
│   │   │   │   ├── FLACPlayer.java         # Class for FLAC playback
│   │   │   │   ├── interfaces
│   │   │   │   │   └── AudioPlayer.java    # Unified interface for players
│   │   │   │   ├── MP3Player.java          # Class for MP3 playback
│   │   │   │   ├── MusicPlayerApp.java     # Main application (with adapters)
│   │   │   │   └── WAVPlayer.java          # Class for WAV playback
│   │   │   └── no_pattern                  # Implementation without Adapter pattern
│   │   │       └── MP3PlayerApp.java       # Simple MP3 application
│   │   └── resources                       # Additional resources (if needed)

Folder Descriptions

common_adapter: Contains a traditional implementation of the Adapter pattern, where each audio format (FLAC, MP3, WAV) has a corresponding adapter implementing the AudioPlayer interface.
modern_adapter: Provides an alternative implementation of the Adapter pattern, possibly with a more modern or optimized approach, while maintaining the same audio playback functionality.
no_pattern: Includes a basic implementation that does not use the Adapter pattern, serving as a comparison to demonstrate the benefits of using the pattern.
interfaces: Contains the AudioPlayer interface, which defines the contract for all audio players.
resources: Folder for configuration files or additional resources (currently empty).

How to Run

Ensure Maven is installed.
Navigate to the project directory:cd adapter-pattern


Compile and run the project:mvn clean install
mvn exec:java -Dexec.mainClass="common_adapter.MusicPlayerApp"

Alternatively, replace common_adapter.MusicPlayerApp with modern_adapter.MusicPlayerApp or no_pattern.MP3PlayerApp to test different implementations.

License
This project is licensed under the MIT License.
