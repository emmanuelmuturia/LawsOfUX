package emmanuelmuturia.lawsofux.home.data.model

data class UXLaw(
    val uxLawThumbnail: Int,
    val uxLawTitle: String,
    val uxLawDescription: String,
    val uXLawTakeaways: List<String>,
    val uXLawOrigins: String,
    val uXLawFurtherReading: List<Triple<String, String, String>>,
    val uXLawSource: String?,
    val uXLawLargeFormatPoster: String,
    val uXLawFreePoster: String
)