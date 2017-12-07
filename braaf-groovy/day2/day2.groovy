List<String> inputRows = new File(new File(getClass().protectionDomain.codeSource.location.path).parent + "/input.txt").readLines();

List<List<String>> matrix = new ArrayList();
for(int i = 0; i < inputRows.size(); i++) {
  matrix.add(inputRows.getAt(i).split('\t'));
}
def accum = 0;
def min = INTEGER_MIN

for(List<String> o : matrix) {
  println("" + o.size());
  //println("MIN: " + o.min());
  //println("MAX: " + o.max());
  
  accum += o.max() - o.min();
}



