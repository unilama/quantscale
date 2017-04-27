/*
 Copyright (C) 2013 Choucri FAHED

 This source code is release under the BSD License.

 This file is part of QuantScale, a free-software/open-source library
 for financial quantitative analysts and developers - 
 http://github.com/choucrifahed/quantscale

 QuantScale is free software: you can redistribute it and/or modify it
 under the terms of the QuantScale license.  You should have received a
 copy of the license along with this program; if not, please email
 <choucri.fahed@mines-nancy.org>.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the license for more details.

 QuantScale is based on QuantLib. http://quantlib.org/
 When applicable, the original copyright notice follows this notice.
 */
/*
 Copyright (C) 2004, 2005, 2006 Ferdinando Ametrano
 Copyright (C) 2006 Katiuscia Manzoni
 Copyright (C) 2000, 2001, 2002, 2003 RiskMap srl
 Copyright (C) 2003, 2004, 2005, 2006, 2008 StatPro Italia srl

 This file is part of QuantLib, a free-software/open-source library
 for financial quantitative analysts and developers - http://quantlib.org/

 QuantLib is free software: you can redistribute it and/or modify it
 under the terms of the QuantLib license.  You should have received a
 copy of the license along with this program; if not, please email
 <quantlib-dev@lists.sf.net>. The license is also available online at
 <http://quantlib.org/license.shtml>.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the license for more details.
*/

package org.qslib.quantscale.time

/**
 * Frequency of events.
 *
 * @author Choucri FAHED
 * @since 1.0
 */
class Frequency(val value: Int) extends AnyVal

object Frequency {

  def apply(frequency: Int): Frequency = new Frequency(frequency)

  implicit def unwrapp(frequency: Frequency): Int = frequency.value

  lazy val NoFrequency = Frequency(-1)
  lazy val Once = Frequency(0)
  lazy val Annual = Frequency(1)
  lazy val Semiannual = Frequency(2)
  lazy val EveryFourthMonth = Frequency(3)
  lazy val Quarterly = Frequency(4)
  lazy val Bimonthly = Frequency(6)
  lazy val Monthly = Frequency(12)
  lazy val EveryFourthWeek = Frequency(13)
  lazy val Biweekly = Frequency(26)
  lazy val Weekly = Frequency(52)
  lazy val Daily = Frequency(365)
  lazy val OtherFrequency = Frequency(999)
}
