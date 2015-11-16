package scenario1;

public class Format {

	private String extensionName;
	private String extension;

	public Format (String extensionName, String extension){
	 this.extensionName = extensionName;
	 this.extension = extension;
	}

	public String getExtensionName() {
		return extensionName;
	}

	public void setExtensionName(String extensionName) {
		this.extensionName = extensionName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Override
	public String toString() {
		return  extensionName + " (*." +extension+")" ;
	}


}