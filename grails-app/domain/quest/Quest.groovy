package quest

class Quest {
    String name
    String description
    Integer difficulty=9
    Date dateCreated
    Date lastUpdated

    static mapping = {
        description type: 'text'
    }
    static constraints = {
        name unique:true
    }
}