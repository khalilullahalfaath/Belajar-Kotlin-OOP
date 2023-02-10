package annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented

// tidak bisa punya properties dan methods
annotation class Fancy(val author: String)
