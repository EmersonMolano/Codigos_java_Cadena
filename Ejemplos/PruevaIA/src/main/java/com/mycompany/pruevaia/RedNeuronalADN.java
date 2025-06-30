import org.deeplearning4j.nn.api.OptimizationAlgorithm;
import org.deeplearning4j.nn.conf.NeuralNetConfiguration;
import org.deeplearning4j.nn.conf.MultiLayerConfiguration;
import org.deeplearning4j.nn.conf.layers.DenseLayer;
import org.deeplearning4j.nn.conf.layers.OutputLayer;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.nd4j.linalg.activations.Activation;
import org.nd4j.linalg.dataset.DataSet;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.learning.config.Sgd;
import org.nd4j.linalg.lossfunctions.LossFunctions;

public class RedNeuronalAND {
    public static void main(String[] args) {
        // Datos de entrada (A y B)
        var entradas = Nd4j.create(new double[][] {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        });

        // Salidas esperadas (A AND B)
        var salidas = Nd4j.create(new double[][] {
            {0},
            {0},
            {0},
            {1}
        });

        var dataset = new DataSet(entradas, salidas);

        // Configuración de la red
        MultiLayerConfiguration config = new NeuralNetConfiguration.Builder()
            .seed(1234)
            .optimizationAlgo(OptimizationAlgorithm.STOCHASTIC_GRADIENT_DESCENT)
            .updater(new Sgd(0.1)) // tasa de aprendizaje
            .list()
            .layer(new DenseLayer.Builder()
                .nIn(2)  // 2 entradas
                .nOut(4) // 4 neuronas ocultas
                .activation(Activation.SIGMOID)
                .build())
            .layer(new OutputLayer.Builder(LossFunctions.LossFunction.MSE) // Error cuadrático medio
                .activation(Activation.SIGMOID)
                .nIn(4)
                .nOut(1) // 1 salida
                .build())
            .build();

        MultiLayerNetwork modelo = new MultiLayerNetwork(config);
        modelo.init();

        // Entrenamiento (1000 épocas)
        for (int i = 0; i < 1000; i++) {
            modelo.fit(dataset);
        }

        // Prueba: mostrar resultados
        var salidaRed = modelo.output(entradas);
        System.out.println("Resultados:");
        System.out.println(salidaRed);
    }
}
