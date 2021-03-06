package kiambogo.scrava.models

sealed trait Streams {
  val `type`: String
  val data: List[Any]
  val series_type: String
  val original_size: Int
  val resolution: String }

case class LatLng(
  `type`: String = "latlng",
  data: List[List[Float]] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Distance(
  `type`: String = "distance",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Time(
  `type`: String = "time",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Altitude(
  `type`: String = "altitude",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Velocity(
  `type`: String = "velocity",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Heartrate(
  `type`: String = "heartrate",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Cadence(
  `type`: String = "cadence",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Watts(
  `type`: String = "watts",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class WattsCalc(
  `type`: String = "watts_calc",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Temp(
  `type`: String = "temp",
  data: List[Int] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Moving(
  `type`: String = "moving",
  data: List[Boolean] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams

case class Grade(
  `type`: String = "grade_smooth",
  data: List[Float] = List(),
  series_type: String = "distance",
  original_size: Int = 0,
  resolution: String = "high") extends Streams
