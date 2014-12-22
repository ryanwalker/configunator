package configunator

class ApplicationEnvironment {

    String name

    static belongsTo = [application: Application]
    static hasMany = [configurationGroup: ConfigurationGroup]

    static constraints = {
    }
}
