abstract class UnitConversion {
  def convert(toBeConverted: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(toBeConverted: Double): Double = {
    toBeConverted * 2.54
  }
}

object GallonsToLiters extends UnitConversion {
  override def convert(toBeConverted: Double): Double = {
    toBeConverted * 3.78541
  }
}

object MilesToKilometers extends UnitConversion {
  override def convert(toBeConverted: Double): Double = {
    toBeConverted * 1.60934
  }
}
