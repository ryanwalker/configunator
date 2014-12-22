package configunator

class Application {

    String name

    static hasMany = [applicationEnvironment: ApplicationEnvironment]

    static constraints = {
    }
}
