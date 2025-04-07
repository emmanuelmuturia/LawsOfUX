package emmanuelmuturia.lawsofux.home.source.model

data class LocalUXLaw(
    val localUxLawID: String = "Default Local UX Law Key",
    val localUxLawThumbnail: Int,
    val localUxLawTitle: String,
    val localUxLawDescription: String,
    val localUXLawTakeaways: List<String>,
    val localUXLawOrigins: String,
    val localUXLawFurtherReading: List<Triple<String, String, String>>,
    // There should be a nullable field[s] for Examples like in Hick's Law...
    // Display the content only if it is not null [Source]...
    val localUXLawSource: String?,
    val localUXLawLargeFormatPoster: String,
    val localUXLawFreePoster: String,
)