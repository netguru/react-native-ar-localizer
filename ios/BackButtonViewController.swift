import UIKit


class BackButtonViewController: UIViewController {

    var headerView: UIView!
    var button: BackButton!

    override func viewDidLoad() {
        super.viewDidLoad()
        setupHeader()
    }
    
    
    func setupHeader() {
        // Initialize views and add them to the ViewController's view
        headerView = UIView()
        self.view.addSubview(headerView)
        button = BackButton()
        button.setTitle("<", for: .normal)
        headerView.addSubview(button)
        
        
        // Set position of views using constraints
        headerView.translatesAutoresizingMaskIntoConstraints = false
        headerView.leadingAnchor.constraint(equalTo: self.view.leadingAnchor).isActive = true
        headerView.topAnchor.constraint(equalTo: self.view.safeAreaLayoutGuide.topAnchor).isActive = true
        headerView.widthAnchor.constraint(equalTo: self.view.widthAnchor, multiplier: 1).isActive = true
        headerView.heightAnchor.constraint(equalTo: self.view.heightAnchor, multiplier: 0.1).isActive = true
        
        button.translatesAutoresizingMaskIntoConstraints = false
        button.leftAnchor.constraint(equalTo: headerView.leftAnchor).isActive = true
        button.bottomAnchor.constraint(equalTo: headerView.bottomAnchor).isActive = true
        button.widthAnchor.constraint(equalTo: headerView.widthAnchor, multiplier: 0.2).isActive = true
        button.heightAnchor.constraint(equalTo: headerView.heightAnchor, multiplier: 0.5).isActive = true
    }
    
}

