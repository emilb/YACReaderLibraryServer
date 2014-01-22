import java.security.MessageDigest

class FileHashCalculator {

    // 524288 bytes of the file for hash and concatenate filesize
    static String calculateHash(String filePath) {
        File f = new File(filePath)

        def fileSize = f.size()

        def bytes = new byte[524288]
        def messageDigest = MessageDigest.getInstance("SHA1")

        FileInputStream fis = new FileInputStream(f)
        int bytesRead = fis.read(bytes)
        messageDigest.update(bytes, 0, bytesRead)
        def sha1Hex = new BigInteger(1, messageDigest.digest()).toString(16).padLeft( 40, '0' )

        return "$sha1Hex$fileSize"
    }
}
