package scala.learning.testing.example

import org.scalatest._

class AlbumSpec extends FlatSpec with ShouldMatchers{

  it should "can add an Artist object to the album" in {
    val album = Album("Thriller", 1981,Artist("Michael", "Jackson"))
    album.artist.firstName should be ("Michael")
  }
}