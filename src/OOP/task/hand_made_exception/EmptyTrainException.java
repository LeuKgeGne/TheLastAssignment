package oop.task.hand_made_exception;

public class EmptyTrainException extends Exception {
        private String train;

        public EmptyTrainException() {}

        public EmptyTrainException(String massage) {
                super(massage);
        }

        public EmptyTrainException(String _train, String massage) {
                super(massage);
                train = _train;
        }

        @Override
        public String toString() {
                return train != null ? super.toString() + ": " + train : super.toString();
        }
}
