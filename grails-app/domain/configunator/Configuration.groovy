package configunator

class Configuration {

    String key
    String value

    static belongsTo = [configurationGroup: ConfigurationGroup]

    static constraints = {
    }
}
