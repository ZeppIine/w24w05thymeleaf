package kr.ac.kumoh.ce.s20180147.w24w05thymeleaf.repository

import kr.ac.kumoh.ce.s20180147.w24w05thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
  protected val songs = listOf(
    Song(1, "夏が僕らを呼ぶのなら ( If Summer is calling us) feat.わかばやし", "*Luna"),
    Song(2, "Rise up feat.初音ミク", "*Luna"),
    Song(3, "あの夏のいつかは (Someday in that Summer) feat.ねんね | 2023 Ver.", "*Luna"),
  )

  val songsSize: Int
    get() = songs.size

  fun getSong(index: Int) = songs[index]
}