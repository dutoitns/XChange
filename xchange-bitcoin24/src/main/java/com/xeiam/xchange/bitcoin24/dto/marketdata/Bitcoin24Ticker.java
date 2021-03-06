/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.bitcoin24.dto.marketdata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data object representing Ticker from Bitcoin24
 */
public final class Bitcoin24Ticker {

  private final BigDecimal last;
  private final BigDecimal high;
  private final BigDecimal low;
  private final BigDecimal avg;
  private final BigDecimal ask;
  private final BigDecimal bid;
  private final BigDecimal trades_today;

  /**
   * Constructor
   * 
   * @param high
   * @param low
   * @param vol
   * @param last
   * @param avg
   * @param ask
   * @param bid
   */
  public Bitcoin24Ticker(@JsonProperty("high") BigDecimal high, @JsonProperty("low") BigDecimal low, @JsonProperty("trades_today") BigDecimal trades_today, @JsonProperty("last") BigDecimal last,
      @JsonProperty("avg") BigDecimal avg, @JsonProperty("ask") BigDecimal ask, @JsonProperty("bid") BigDecimal bid) {

    this.high = high;
    this.low = low;
    this.last = last;
    this.avg = avg;
    this.ask = ask;
    this.bid = bid;
    this.trades_today = trades_today;
  }

  public BigDecimal getAvg() {

    return avg;
  }

  public BigDecimal getBuy() {

    return bid;
  }

  public BigDecimal getHigh() {

    return high;
  }

  public BigDecimal getLast() {

    return last;
  }

  public BigDecimal getLow() {

    return low;
  }

  public BigDecimal getSell() {

    return ask;
  }

  public BigDecimal getVol() {
	 
	// Volume not available, use number of trades
    return trades_today;
  }

  @Override
  public String toString() {

    return "Bitcoin24Ticker [last=" + last + ", high=" + high + ", low=" + low + ", avg=" + avg + ", buy=" + bid + ", sell=" + ask + ", vol=" + trades_today + "]";
  }

}
