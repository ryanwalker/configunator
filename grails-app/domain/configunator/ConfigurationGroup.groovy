package configunator

class ConfigurationGroup {

    String name

    static belongsTo = [applicationEnvironment: ApplicationEnvironment]
    static hasMany = [configuration: Configuration]

    static constraints = {
    }
}
