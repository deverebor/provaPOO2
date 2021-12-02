public class Calc {
  private Double value;
  private Boolean overdue;
  private Double total;
  
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public Boolean getOverdue() {
    return overdue;
  }

  public void setOverdue(Boolean overdue) {
    this.overdue = overdue;
  }

  public void fees() {
    if(getOverdue() == true ) {
      this.total = this.value + 0.50;
    }
  }

  public Double penalty() {
    Double result = (2 * 100) / this.total;

    return result;
  }
   
}
